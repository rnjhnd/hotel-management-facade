# Hotel Management Facade

A Java implementation of the Facade design pattern for a simplified hotel operations interface. The client interacts with a single entry point (`FrontDesk`) to request common services such as valet pickup, room cleaning, and luggage carts.

## 📋 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation & Usage](#installation--usage)
- [Code Examples](#code-examples)
- [Design Patterns Used](#design-patterns-used)
- [UML Class Diagram](#uml-class-diagram)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This project demonstrates how a Facade can provide a unified, high-level API for multiple subsystems. Instead of the client knowing about every service, it only calls the `FrontDesk`.

### Key Benefits:
- **Unified Interface**: One entry point for multiple services
- **Loose Coupling**: Client is decoupled from subsystem details
- **Simplicity**: Clear, intention-revealing API
- **Extensibility**: Easy to add new services behind the facade

## 🏗️ Architecture

The system follows the Facade pattern with these core components:

### Core Classes:
- **`FrontDesk`**: The facade that exposes high-level operations
- **`Valet`**: Subsystem handling vehicle pickup
- **`HouseKeeping`**: Subsystem handling room cleaning
- **`Cart`**: Subsystem handling luggage carts
- **`HotelService`**: Common interface for services
- **`HotelApp`**: Client that uses the facade

### Design Principles:
- **Single Responsibility**: Each service class has a focused role
- **Open/Closed Principle**: Add new services without modifying the client
- **Encapsulation**: Hides subsystem complexity behind the facade

## ✨ Features

### 🔧 Service Orchestration
- High-level methods: `pickUpVehicle`, `cleanRoom`, `requestCart`
- Delegation to the proper subsystem

### 🧰 Unified Interface
- One simple API for common hotel operations

### 🔄 Extensibility
- Add new services by implementing `HotelService` and extending `FrontDesk`

## 📁 Project Structure

```
hotel-management-facade/
├── src/
│   ├── Cart.java                 # Luggage cart service (subsystem)
│   ├── FrontDesk.java            # Facade exposing high-level API
│   ├── HotelApp.java             # Client / entry point
│   ├── HotelService.java         # Service interface
│   ├── HouseKeeping.java         # Room cleaning service (subsystem)
│   ├── UML Class Diagram.png     # Class diagram
│   └── Valet.java                # Valet service (subsystem)
└── README.md                     # Project documentation
```

## 🚀 Installation & Usage

### Prerequisites
- Java 8 or higher

### Running the Application (Windows PowerShell)

1. Navigate to the project root
2. Compile the sources to an output directory
3. Run the main class

```powershell
cd "C:\Users\Ellaine Dale\Downloads\hotel-management-facade"
mkdir out
javac -d out src/*.java
java -cp out FacadePattern.HotelApp
```

### Expected Output
```
Vehicle with Plate Number XYZ-1234 has been successfully picked up!

Room 42 has been tidied up and refreshed!

3 cart/s are on their way!
```

## 💻 Code Examples

### Using the Facade
```java
import FacadePattern.FrontDesk;

public class Demo {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.pickUpVehicle("XYZ-1234");
        frontDesk.cleanRoom(42);
        frontDesk.requestCart(3);
    }
}
```

## 🎨 Design Patterns Used

### Facade Pattern
This project demonstrates the **Facade pattern**, which provides a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use.

**Key Components:**
- **Facade** (`FrontDesk`): High-level interface for clients
- **Subsystems** (`Valet`, `HouseKeeping`, `Cart`): Concrete services
- **Client** (`HotelApp`): Uses the facade instead of interacting with subsystems directly

**Benefits:**
- ✅ Simplifies complex interactions
- ✅ Reduces coupling between client and subsystems
- ✅ Improves readability and maintainability

## 📊 UML Class Diagram
<img width="1362" height="1280" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/ee21370b-96ff-462c-a4a7-3f6728845353" />

The diagram illustrates how the Facade coordinates subsystems:
- **Client dependency**: `HotelApp` depends only on `FrontDesk`.
- **Facade role**: `FrontDesk` aggregates `Valet`, `HouseKeeping`, and `Cart`, delegating requests to them.
- **Common contract**: `Valet`, `HouseKeeping`, and `Cart` implement the `HotelService` interface.
- **Exposed operations**: `FrontDesk` offers `pickUpVehicle`, `cleanRoom`, and `requestCart`, which proxy to the corresponding subsystem methods.

## 🔮 Future Enhancements

### Potential Features:
- **New Services**: Concierge, Room Service, Spa, Laundry
- **Request Scheduling**: Queue and prioritize service requests
- **Logging & Monitoring**: Track requests and performance
- **Error Handling**: Rich exceptions and retries for failed operations

### Technical Improvements:
- **Dependency Injection**: Provide services to `FrontDesk` via constructor
- **Testing**: Unit tests with mocks for subsystems
- **CLI/Args**: Parameterize inputs for demo runs
- **Build Tooling**: Optional Maven/Gradle setup

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m "Add amazing feature"`)
4. Push the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Follow Java coding conventions
- Keep classes focused; prefer small, cohesive services
- Add tests for new functionality
- Update documentation as needed

## 📄 License

This project is open source and available under the [MIT License](LICENSE).


---

**Note:** This implementation demonstrates clean code principles and design patterns best practices. The Facade pattern is particularly useful when you need to provide a unified, simplified interface to a complex set of subsystems, reducing coupling and improving usability without changing the underlying services.
