# Atlassian Reference Application (REFAPP)

## Description

The Atlassian Reference Application, or reference implementation, is known as the 'RefApp'. It is a
model implementation of the Atlassian Plugin Framework 2. It takes the form of a simple web
application, which implements the plugin framework and does not do much more than that.

## Atlassian Developer?

### Committing Guidelines

Please see [the following guide](https://extranet.atlassian.com/x/Uouvdg) for committing to this module.

### Builds

The Bamboo builds for this project are on [BEAC](https://extranet-bamboo.internal.atlassian.com/browse/REFAPP).

## External User?

### Issues

Please raise any issues you find with this module in [JIRA](https://ecosystem.atlassian.net/browse/REFAPP).

### Documentation

To run locally,

    mvn clean install
    cd refapp-webapp
    mvn cargo:run

Then connect to RefApp at [http://localhost:8179/atlassian-refapp/](http://localhost:8179/atlassian-refapp/),
and check the log files at `refapp-webapp/target/output.log`.

[Read More](https://developer.atlassian.com/display/DOCS/About+the+Atlassian+RefApp)
