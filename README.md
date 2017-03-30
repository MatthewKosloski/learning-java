# learning-java

A myriad of excercises from [Java Software Solutions (8th edition)](https://www.amazon.com/Java-Software-Solutions-John-Lewis/dp/0133594955/ref=sr_1_1?ie=UTF8&qid=1485137740&sr=8-1&keywords=9780133594959).

## Running Java Programs & Watching for Changes

### Prerequisites

- Make sure you have Java installed, check by running `java -version`
- Install [entr](https://bitbucket.org/eradman/entr/) package with `brew install entr`

## Watching (automatic)

The following runs the program `Countdown` in the `chapter/2` folder and watches for changes:

```
bash java.bash chapter/2 Countdown
```

Or, if you want to compile and run the Java program manually (in chapter directory):

```
javac Countdown.java && java Countdown
```

## Running Applets

The following displays the `Einstein` applet in a new window:

```
bash applet.bash chapter/2 Einstein
```