# Project Description

This is a Git Repo for development of prototype solution to the issue 'How might we make
commenting an enjoyable part of software development, whilst assuring quality of comments
in code'.

The goal of this solution is to offer a plugin in IntelliJ that will standardize current
comments, auto-generate recommended comments, and posted all comments to a GitWiki to be
used as a resource for a team of developers.

# Development History

Prototype #1 - A coding solution for a plugin to allow IntelliJ users to search selected text in Google. - John

Prototype #2 (21.11.20) - Comment refactoring tool that recognizes comments and prints to command line. - John

# Test the current prototype

1.  Clone from VCS using the link above
2.	Install the Gradle plugin for IntelliJ
3.	Code can be found for the plugin itself in src/main/java/AskQuestionAction.java and src/main/resources/META-INF/plugin.xml
4.	Click the View->Tools Menu->Gradle
6.	In the Gradle toolbar navigate to Tasks/intellij/runide
7.	Once clicked, I think you should be prompted to download something - this is the IDE with the plugin installed.
8.	Click runide again and a second IntelliJ should launch with the plugin installed under the Tools Button on the Toolbar  