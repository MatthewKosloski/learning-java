#!/bin/bash  
chapter=$1;
program=$2; 
cd $chapter && javac $program.java && appletviewer $program.html;