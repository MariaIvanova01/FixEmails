# FixEmails

You are given a sequence of strings, each on a new line until you receive the "stop" command. The first string is a name of a person. On the second line, you receive his email.
Your task is to collect their names and emails and remove emails whose domain ends with "us", "uk" or "com" (case insensitive). 
Print in the following format:

"{name} – > {email}"

Examples
---------

Input | Output
------|-------
John | John -> johnDoe@softuni.org
johnDoe@softuni.org | Peter Smith -> smith.peter@softuni.org
Peter Smith |
smith.peter@softuni.org |
Taylor Baker |
baker@gmail.com |
stop |

