# JFileSync MW - (Java File Sync - Multi Way) 

A multi way filesync tool written in pure Java.

It is inspired by [JFileSync](http://jfilesync.sourceforge.net/).

## Usage

## Building

    ./mvnw verify
    ./mvnw install
    ./mvnw bnd-resolver:resolve
    ./mvnw package
    
    java -jar jfsmw-app/target/jfsmw-app.jar
    
## Development

    java -jar jfsmw-app/target/debug.jar

### Adding a new module
<https://enroute.osgi.org/tutorial/030-tutorial_microservice.html>

#### Creating an API Project

    ./mvnw -s osgi-mvn-settings.xml archetype:generate -DarchetypeGroupId=org.osgi.enroute.archetype -DarchetypeArtifactId=api -DarchetypeVersion=7.0.0-SNAPSHOT

With settings like this:

    Define value for property 'groupId': net.jfilesync.jfsmw
    Define value for property 'artifactId': <project>-api
    Define value for property 'version' 1.0-SNAPSHOT: : 0.0.1-SNAPSHOT
    Define value for property 'package' net.jfilesync.jfsmw.<project>.api: net.jfilesync.jfsmw.<project>
    Confirm properties configuration:
    groupId: net.jfilesync.jfsmw
    artifactId: <project>-api
    version: 0.0.1-SNAPSHOT
    package: net.jfilesync.jfsmw.<project>
    Y: :

#### Creating an Implementation Project

    ./mvnw -s osgi-mvn-settings.xml archetype:generate -DarchetypeGroupId=org.osgi.enroute.archetype -DarchetypeArtifactId=ds-component -DarchetypeVersion=7.0.0-SNAPSHOT

With settings like this:

    Define value for property 'groupId': net.jfilesync.jfsmw
    Define value for property 'artifactId': <project>-impl
    Define value for property 'version' 1.0-SNAPSHOT: : 0.0.1-SNAPSHOT
    Define value for property 'package' net.jfilesync.jfsmw.<project>.impl: :
    Confirm properties configuration:
    groupId: net.jfilesync.jfsmw
    artifactId: <project>-impl
    version: 0.0.1-SNAPSHOT
    package: net.jfilesync.jfsmw.<project>.impl
    Y: :

### IntelliJ IDEA

1. git clone <git-project-url>
2. Open the repo directory with IDEA "Open..."
3. Run `./mvnw verify` in the repo directory
