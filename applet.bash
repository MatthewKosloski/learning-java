#!/bin/bash  
path=$1;
program=$2; 
cd $path && javac $program.java && appletviewer $program.html;