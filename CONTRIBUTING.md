# Contributing to this Project

## Welcome
Welcome to the Storyteller Tools project we are happy to welcome contributions from the community. Please make sure to read our [Code of Conduct](CODE_OF_CONDUCT.MD) before contributing to this project whether through discussions, opening a new issue, etc.

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
Before submitting an issue please make sure that the feature request or the bug report does not already exist. 

When creating a feature request make sure that you have a clear idea in mind. State what feature you would like to see as clearly as possible, and describe what the sucessful implementation should look like. If you are unsure of how to get started or need help refining your idea feel free to create a discussion in our [Discussions Board](github.com/rjbeer/Storyteller-Tools/discussions).

When submitting a bug report clearly state what bug you have encountered, post any pictures related to the bug including error messages if any, the input and resulting output that is incorrect ,etc. Make sure to state how to replicate the bug that you have encountered, if you are not sure how you encountered the bug in question try to recreate the bug and list the steps involved in doing so.

Once either a feature request or a bug report has been submitted the community may have further questions or comments on the submitted issue.

## Creating a Pull Request
When creating a pull request please keep a few things in mind:

1. When submitting a pull request make sure that your title clearly states which issue the PR solves. If the issue does not exist make sure to submit either a feature request or a bug report and have it approved before submiting your PR.

2. If compiling your solution is different than the standard method described above document how to compile and run your solution.

3. Make sure to describe how you either fixed the bug or what you implemented to satisfy a feature request. This does not have to be increadibly detailed, but it should at least make reviewing your solution a bit more clear and can reduce the number of clarifying questions that may be asked.

4. There may be questions asked about the design decisions you have made. Be ready to answer any and all such questions.

5. Most importantly please be patient when submitting a pull request. It may take time for someone to review your code before commenting via the same Pull Request on the status of said PR.


## A Note on AI Usage

Though AI is not prohibited from being used to help in an individual workflow for this project do note that any such use must be stated in your Pull Request. Though all PRs are carefully looked over expect for such a situation to have a little extra scrutiny to ensure that there are no conflicts with the current build. If AI has been used and it is not stated the PR will not be merged and will be closed. Similarly if a PR is merged and it is later found out that AI was used when it was not stated in the PR, the changes will be reverted and the closed issue will be reopened.

AI will not be allowed to assist in reviewing a PR. Every PR must be reviewed, and approved by a human. If an AI was used to review a PR and a critical bug slips through the person who accepted the PR will be responsible and the excuse that an AI let the problem slip through will not be accepted.


## Final Notes

These documents, as well as all documentation can be changed at any time if and when it becomes neccessary to do so. Any changes that you want to see should be posted in the Discussions board of the project where they can be discussed by the community.
