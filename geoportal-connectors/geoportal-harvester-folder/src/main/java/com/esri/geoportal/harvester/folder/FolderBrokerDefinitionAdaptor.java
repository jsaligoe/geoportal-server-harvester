/*
 * Copyright 2016 Esri, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.geoportal.harvester.folder;

import com.esri.geoportal.harvester.api.EntityDefinition;
import com.esri.geoportal.harvester.api.base.BrokerDefinitionAdaptor;
import java.io.File;
import org.apache.commons.lang3.StringUtils;

/**
 * Folder broker definition adaptor.
 */
public class FolderBrokerDefinitionAdaptor extends BrokerDefinitionAdaptor {

  public static final String P_ROOT_FOLDER = "folder-root-folder";
  
  private File rootFolder;

  /**
   * Creates instance of the adaptor.
   * @param def broker definition
   */
  public FolderBrokerDefinitionAdaptor(EntityDefinition def) throws IllegalArgumentException {
    super(def);
    if (StringUtils.trimToEmpty(def.getType()).isEmpty()) {
      def.setType(FolderConnector.TYPE);
    } else if (!FolderConnector.TYPE.equals(def.getType())) {
      throw new IllegalArgumentException("Broker definition doesn't match");
    } else {
      try {
        this.rootFolder = new File(get(P_ROOT_FOLDER));
      } catch (NullPointerException ex) {
        throw new IllegalArgumentException(String.format("Invalid %s: %s",P_ROOT_FOLDER,get(P_ROOT_FOLDER)), ex);
      }
    }
  }

  /**
   * Gets root folder.
   *
   * @return root folder
   */
  public File getRootFolder() {
    return rootFolder;
  }

  /**
   * Sets root folder.
   *
   * @param rootFolder root folder
   */
  public void setRootFolder(File rootFolder) {
    this.rootFolder = rootFolder;
    set(P_ROOT_FOLDER, rootFolder.toString());
  }
}
