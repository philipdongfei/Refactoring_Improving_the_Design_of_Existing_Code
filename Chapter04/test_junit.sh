#!/bin/bash

javac -cp /usr/share/java/junit4-4.12.jar CustomerTest.java
java  -cp /usr/share/java/junit4-4.12.jar:. org.junit.runner.JUnitCore CustomerTest

