# Project Description

This is a Git Repo for development of prototype solution to the issue 'How might we make
commenting an enjoyable part of software development, whilst assuring quality of comments
in code', as part of a QUB module in November 2020.

The goal of this solution is to offer a plugin in IntelliJ that will standardize current
comments, auto-generate recommended comments, and posted all comments to a GitWiki to be
used as a resource for a team of developers.

# Development History

Prototype #1 - A coding solution for a plugin to allow IntelliJ users to search selected text in Google.

Prototype #2 (21.11.20) - Comment refactoring tool that recognizes comments and prints to command line.

Final Prototype - 'Read Comments' scans current class and suggests comments to improve readability. 'Generate new Comments' will add the approved comments into the class. 'Write Documentation' will generate txt files that could feasibly be used in a GitWiki for an entire codebase.

# Future Propositions

Due to the deadlines of the project, there was restrictions into possible features to implement. The following points are proposals for further development should it continue:

- Streamline the 'Read Comments' and 'Generate New Comments' into one action option with a submenu which allows you to select what comments to insert.
- Add templating to the 'Generate Documentation' action to create a more stylised and easier read documentation.
- Add a final action, 'Update GitWiki Documentation' which would use the documentation generated previously in 'Generate Documentation' and publish/update the respective repositorys GitWiki.
- Streamline 'Generate Documentation' and 'Update GitWiki Documentation' into 1 option with a submenu popup that allows for selection of multiple classes to generate documentation alongside a preview of the document tree/directory that will be published to GitWiki.

# Test the current prototype

1.  Clone from VCS using the link above
2.	Install the Gradle plugin for IntelliJ
3.	Code can be found for the plugin itself in src/main/java/AskQuestionAction.java and src/main/resources/META-INF/plugin.xml
4.	Click the View->Tools Menu->Gradle
6.	In the Gradle toolbar navigate to Tasks/intellij/runide
7.	Once clicked, you will be prompted to download a new IntelliJ IDE that contains the plugin.
8.	Click runide again and a second IntelliJ should launch with the plugin installed under the Tools Button on the Toolbar  