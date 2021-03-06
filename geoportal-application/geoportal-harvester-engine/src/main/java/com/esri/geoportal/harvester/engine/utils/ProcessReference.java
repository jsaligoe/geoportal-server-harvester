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
package com.esri.geoportal.harvester.engine.utils;

import com.esri.geoportal.harvester.api.ProcessInstance;
import java.util.UUID;

/**
 * Process reference.
 */
public final class ProcessReference {
  private final UUID uuid;
  private final ProcessInstance process;

  /**
   * Creates instance of the wrapper.
   * @param uuid id of the process
   * @param process process
   */
  public ProcessReference(UUID uuid, ProcessInstance process) {
    this.uuid = uuid;
    this.process = process;
  }
  
  @Override
  public String toString() {
    return String.format("PROCESS REF :: uuid: %s, %s", process, getProcessId());
  }

  /**
   * Gets process id.
   * @return process id
   */
  public UUID getProcessId() {
    return uuid;
  }

  /**
   * Gets process.
   * @return process
   */
  public ProcessInstance getProcess() {
    return process;
  }
}
