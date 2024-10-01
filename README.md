# Git Tutorial Basics
Git is a version-control system for tracking changes in computer files and coordinating work on those files among multiple people. Git is a Distributed Version Control System. So Git does not necessarily rely on a central server to store all the versions of a project’s files. Instead, every user “clones” a copy of a repository (a collection of files) and has the full history of the project on their own hard drive. This clone has all of the metadata of the original while the original itself is stored on a self-hosted server or a third party hosting service like GitHub.

## Step 0: Make a GitHub Account.
If you don't already have one, you can make one here: https://github.com/

## Step 1: Make sure you have Git installed on you machine.
If you are on a Mac, fire up the terminal and enter the following command:

$ git --version

## Step 2: Tell Git who you are.
Introduce yourself. Slide in. Seriously, mention your Git username and email address, since every Git commit will use this information to identify you as the author.

$ git config --global user.name "YOUR_USERNAME"

$ git config --global user.email "im_satoshi@musk.com"

$ git config --global --list # To check the info you just provided

Initialize Git:
And to place it under git, enter:

$ touch README.md    # To create a README file for the repository
$ git init           # Initiates an empty git repository

## Step 4: Let’s Git
Create a new repository on GitHub. Follow this link.
Now, locate to the folder you want to place under git in your terminal.

$ cd Desktop/your_directory
Initialize Git:
And to place it under git, enter:

$ touch README.md    # To create a README file for the repository
$ git init           # Initiates an empty git repository

Add files to the Staging Area for commit:
Now to add the files to the git repository for commit:

$ git add .  
# Adds all the files in the local repository and stages them for commit

Commit Changes you made to your Git Repo:
Now to commit files you added to your git repo:

$ git commit -m "First commit"
# The message in the " " is given so that the other users can read the message 

Add a remote origin and Push:
Now each time you make changes in your files and save it, it won’t be automatically updated on GitHub. All the changes we made in the file are updated in the local repository. Now to update the changes to the master:

$ git remote add origin remote_repository_URL
# sets the new remote

## Option 1: Use a Personal Access Token (PAT)
Generate a Personal Access Token (PAT):

Log in to your GitHub account.
Go to Settings > Developer Settings > Personal Access Tokens > Tokens (classic).
Click on Generate new token.
Choose the appropriate scopes (e.g., repo to access repositories).
Generate the token and copy it (you won’t be able to see it again).

git remote set-url origin https://<your-username>:<your-token>@github.com/Soodep/tutorial.git

git push -u origin main


To change remote origin url
Steps to Change the Remote Origin:
Verify the Current Remote URL: Check the current remote URL for origin using:
git remote -v


Change the Remote Origin URL: Use the following command to change the remote URL:
git remote set-url origin <new-remote-url>

## Make sure the branch is same
git remote add origin https://github.com/sudipfgcu/software_eng.git
git branch -M main
git push -u origin main

