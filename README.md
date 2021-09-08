# cacti

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

cacti is a collection of object-oriented Kotlin primitives.

**Principles**.
These are the [design principles](https://www.elegantobjects.org#principles) behind cacti.

### How to use
Currently, the only way to use the library is to clone the repository.
This is not going to be published until 0.0.1 release.

## Numbers
The library only works with `Numeric` objects. So you will
have to wrap a number (Int, Double, Float etc) with `Number` which is 
`Numeric`.
```kotlin
val number: Numeric = Number(256)
```

#### Arithmetic operations
To sum two numbers
```kotlin
val result: Numeric = Sum(
    Number(5),
    Number(10)
) // 15
```

To multiply two numbers
```kotlin
val result: Numeric = Product(
    Number(50),
    Number(2)
) // 100
```

To subtract one number from another
```kotlin
val result: Numeric = Difference(
    Number(5),
    Number(2)
) // 3
```

To divide one number by another
```kotlin
val result: Numeric = Quotient(
    Number(10),
    Number(2)
) // 5
```

**All these accept `Numeric` objects in their constructors**, 
so they are strongly composable
```kotlin
val result: Numeric = Product(
    Difference(
        Quotient(
            Number(100),
            Number(2)
        ),
        Difference(
            Number(30),
            Number(5)
        )
    ),
    Number(2)
) // equivalent of (100 / 2 - (30 - 5)) * 2
```

#### Comparisons
To get the lowest number of two
```kotlin
val result: Numeric = Minimum(
    Number(5),
    Number(2)
) // 2
```

To get the highest number of two
```kotlin
val result: Numeric = Maximum(
    Number(5),
    Number(2)
) // 5
```

## Questions

Ask your questions related to cacti library on [Stackoverflow](https://stackoverflow.com/questions/ask) with `kotlin-cacti` tag.

## How to contribute?

Just fork the repo and send us a pull request.

###### Special thanks to [@yegor256](https://github.com/yegor256) Yegor Bugayenko ([Blog](http://www.yegor256.com))
