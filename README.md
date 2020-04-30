# Geoportal Server Harvester
[![apache licensed](https://img.shields.io/badge/license-Apache%202.0-orange.svg?style=flat-square)](https://raw.githubusercontent.com/Esri/geoportal-server-harvester/master/LICENSE.txt)

Geoportal Server Harvester is the next generation metadata harvester, enabling harvesting from many different sources into Geoportal Server Catalog, a local folder, ArcGIS Enterprise Portal, or ArcGIS Online. 

Geoportal Server v2 now provides the catalog and harvesting capabilities as separate modules. Separate modules are useful when users want to use the harvesting capabilities as a stand-alone broker between catalogs of content.

This repository contains the capability of Geoportal Server Harvester, while it's sibling [Geoportal Server Catalog](https://github.com/Esri/geoportal-server-catalog) is managed as a separate repository.

(Note: The long-lived Geoportal Server v1.x is now retired; its archive is [available here](https://github.com/Esri/geoportal-server).)

For details about Geoportal Server Harvester, please visit the [wiki](https://github.com/Esri/geoportal-server-harvester/wiki).

To report an issue, please go to [issues](https://github.com/Esri/geoportal-server-harvester/issues).

## Releases and Downloads
- 2.6.1 - Released November 13, 2018, click [here](https://github.com/Esri/geoportal-server-harvester/releases) for release notes and downloads. 

## Features

* Please visit [Features](https://github.com/Esri/geoportal-server-harvester/wiki/Features).

## Instructions

Building the source code:

* Run 'mvn clean install'

Deploying war file:

* Deploy 'geoportal-application\geoportal-harvester-war\target\geoportal-harvester-war-&lt;version&gt;.war' into the web server of your choice.
* No configuration required.

## Requirements

* Java JDK 1.8.x
* Apache Tomcat 8 or higher

## Contributing

Esri welcomes contributions from anyone and everyone. Please see our [guidelines for contributing](https://github.com/esri/contributing).

## Licensing
Copyright 2016 Esri

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

A copy of the license is available in the repository's [LICENSE](LICENSE.txt) file.
