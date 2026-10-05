# Builder Design Pattern

Java example of constructing a phone object through a builder.

## How it works

`PhoneBuilder` creates a `Phone` with default operating system, RAM and screen-size values. Its setters return the builder for chained configuration, and `getPhone()` returns the object. `BuilderDP` prints the default phone configuration.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/builderdp/*.java
java -cp out builderdp.BuilderDP
```

