# Nissan Connect API
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors)

![Maven Central](https://img.shields.io/maven-central/v/solutions.tveit.nissanconnect/nissanconnect-api.svg)
[![Build Status](https://travis-ci.org/josteitv/nissanconnect-api.svg?branch=master)](https://travis-ci.org/josteitv/nissanconnect-api)
[![Known Vulnerabilities](https://snyk.io/test/github/josteitv/nissanconnect-api/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/josteitv/nissanconnect-api?targetFile=pom.xml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=solutions.tveit.nissanconnect%3Anissanconnect-api&metric=alert_status)](https://sonarcloud.io/dashboard?id=solutions.tveit.nissanconnect%3Anissanconnect-api)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=solutions.tveit.nissanconnect%3Anissanconnect-api&metric=coverage)](https://sonarcloud.io/dashboard?id=solutions.tveit.nissanconnect%3Anissanconnect-api)

A Java library for the Nissan Connect API (also known as Carwings).
The API is used to get information and remotely control your Nissan Leaf.

## Installation

Add the following dependency to you pom.xml.
```xml
<dependency>
    <groupId>solutions.tveit.nissanconnect</groupId>
    <artifactId>nissanconnect-api</artifactId>
    <version>0.0.2</version>
</dependency>
```

## Usage

```java
public class Main {
    
    public static void main(String[] args) throws Exception {        
        // Create async service
        NissanConnectAsyncService service = new NissanConnectAsyncService();
        
        // Log in
        String userId = "owner@example.com";
        String password = "MySecretPassword123!";
        service.login(Region.EUROPE, userId, password);
        
        // Force update of battery status from car (this will take some time)
        Future<BatteryStatusCheckResultResponse> batteryStatus = service.getBatteryStatus();
        BatteryStatusCheckResultResponse batteryStatusCheckResultResponse = batteryStatus.get();
        
        // Get state of charge (SOC) from server
        Future<BatteryStatusRecordsResponse> batteryStatusRecords = service.getBatteryStatusRecords();
        BatteryStatusRecordsResponse batteryStatusRecordsResponse = batteryStatusRecords.get();
        String soc = batteryStatusRecordsResponse.getBatteryStatusRecords().getBatteryStatus().getSoc().getValue();
        System.out.println("soc: " + soc);
        
        // Turn on air condition
        service.turnAcOn();
    }
}
```

## References

- Protocol description: http://virantha.com/2016/04/07/updated-reverse-engineering-nissan-connect-ev-protocol/
- JavaScript API: https://github.com/philliphoff/carwings2
- Python API: https://github.com/jdhorne/pycarwings2


## How to release

This is how the project is released to Maven Central Repository.

Add the following config to your Maven settings.xml file:
```xml
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>your-jira-id</username>
      <password>your-jira-pwd</password>
    </server>
  </servers>
  <profiles>
    <profile>
      <id>ossrh</id>
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
      <properties>
        <gpg.executable>gpg2</gpg.executable>
        <gpg.passphrase>the_pass_phrase</gpg.passphrase>
      </properties>
    </profile>
  </profiles>  
</settings>
```

### Snapshots

Create and deploy SNAPSHOT
```
$ mvn clean deploy
```

Snapshot is now available at
https://oss.sonatype.org/content/repositories/snapshots/solutions/tveit/nissanconnect/nissanconnect-api/

### Release

Create release and deploy to staging repository
```
$ mvn release:clean release:prepare
$ mvn release:perform
```

Promote from staging to central repository
```
$ cd target/checkout
$ mvn nexus-staging:release
```

Drop the staging repository (if something went wrong)
```
$ cd target/checkout
$ mvn nexus-staging:drop
```

For more information see
https://central.sonatype.org/pages/apache-maven.html


## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/ToineSiebelink"><img src="https://avatars1.githubusercontent.com/u/17005440?v=4" width="100px;" alt="ToineSiebelink"/><br /><sub><b>ToineSiebelink</b></sub></a><br /><a href="https://github.com/josteitv/nissanconnect-api/issues?q=author%3AToineSiebelink" title="Bug reports">🐛</a> <a href="https://github.com/josteitv/nissanconnect-api/commits?author=ToineSiebelink" title="Code">💻</a></td>
  </tr>
</table>

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!