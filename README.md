# 📌 String Utils - Cryxie

A utility library for string manipulation, designed for use with the Cryxie package manager.

## 🚀 Installation

To install this package, use the following command:

```sh
cryxie install string_utils@0.0.1
```

🔧 Usage
Import and use the StringUtils class in your Java project:

```java
package string_utils.cryxie;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.capitalizeFirstCaracter("cryxie"));
        // Output: Cryxie
    }
}
```

## 📜 Methods

`capitalizeFirstCaracter(String string)`
**Description**: Capitalizes the first character of the given string.

**Parameters:**

`string` (String) – The input string to be modified.
Returns:

A new string with the first character capitalized.
**Exceptions:**

- `NullPointerException` if the input string is null.
- `StringIndexOutOfBoundsException` if the input string is empty.

## 📌 Why Cryxie Instead of Maven?

This package is managed using Cryxie, a lightweight package manager designed for rapid installation and simplified dependency management. Unlike Maven, Cryxie does not require XML configuration, making it easier to integrate small utility libraries without additional setup.

## 📄 License

This project is licensed under the MIT License.
