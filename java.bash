#!/bin/bash  
path=$1;
program=$2; 
find . -name $program.java | entr -c bash compile.bash $path $program;