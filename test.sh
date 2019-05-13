#!/usr/bin/env bash
javac BinarySearcher.java
java BinarySearcher 10 > actual
diff actual testFor10
java BinarySearcher 60 > actual
diff actual testFor60
java BinarySearcher 30 > actual
diff actual testFor30hg