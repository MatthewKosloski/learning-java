#!/bin/bash  
chapter=$1;
program=$2; 
find . -name $program.java | entr -c bash compile.bash $chapter $program;