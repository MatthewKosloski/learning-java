# learning-java

A myriad of excercises from [Java Software Solutions (8th edition)](https://www.amazon.com/Java-Software-Solutions-John-Lewis/dp/0133594955/ref=sr_1_1?ie=UTF8&qid=1485137740&sr=8-1&keywords=9780133594959).

## Running Java Programs & Watching for Changes

### Prerequisites

- Make sure you have Java installed, check by running `java -version`
- Install [entr](https://bitbucket.org/eradman/entr/) package with `brew install entr`

## Script

The following runs the program `Countdown` in the `chapter_two` folder and watches for changes.

```
find . -name 'Countdown.java' | entr -c bash run.bash chapter_two Countdown
```