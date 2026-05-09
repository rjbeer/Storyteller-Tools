# Contributing to this Project

## Welcome
Welcome to the Storyteller Tools project we are happy to welcome contributions from the community. Please make sure to read our [Code of Conduct](CODE_OF_CONDUCT.md) before contributing to this project whether through discussions, opening a new issue, etc.

## Getting Started with Storyteller Tools
Before implementing a feature or fixing a bug make sure that an issue exists reflecting what it is you would like to contribute to this project. If the issue does not exist first create the issue and follow our feature request/bug report guidelines when doing so. A few questions may be asked within the issue for clarification before it is labeled.


IMPORTANT NOTE: At present there is a plan to implement tests and to use maven as our build tool. Currently these have not been implemented but will in the future, once this has been done the below instructions will change to reflect those changes.


To get started with Storyteller Tools please make sure to:

1. have a Java development kit (JDK) 21 or later installed.
2. Fork this repository and clone to your local machine.
3. Create a feature branch via
```
$ git checkout -b <feature-branch-name>
```
4. Once you have implemented a feature or fixed a bug make sure the project compiles via
```
$ javac -d . *.java
```
5. Make sure that the introduced feature or fix runs with
```
$ java rb.storytellertools.tools.StTools
```
and testing your implementation
6. push your feature branch to your repository and submit a pull request.

Congratulations! Please wait for someone to review your PR and comment on it or merge it into the working branch.

## Creating a feature request/bug report
To suggest a Feature Request 
