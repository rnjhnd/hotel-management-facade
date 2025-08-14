# Hotel Management Facade

A Java implementation of the **Facade Design Pattern** for simplified hotel operations management. This project demonstrates how to use a facade to provide a unified interface to multiple hotel service subsystems, making it easier for clients to interact with complex hotel operations.

## 📋 Overview

The Hotel Management Facade provides a single, simplified interface (`FrontDesk`) for accessing various hotel services including valet parking, housekeeping, and luggage cart services. Instead of clients needing to interact with each service subsystem directly, they can use the facade to access all services through a clean, high-level API.

## 🏗️ Architecture

This project implements the **Facade Design Pattern** with the following components:

- **FrontDesk**: The facade that provides a unified interface to all hotel services
- **HotelService Interface**: Defines the contract for all hotel service implementations
- **Service Subsystems**: Valet, HouseKeeping, and Cart service implementations
- **HotelApp**: Main application demonstrating the facade pattern in action

### Design Pattern Benefits

- **Simplified Interface**: Clients interact with one facade instead of multiple subsystems
- **Loose Coupling**: Client code is decoupled from subsystem implementation details
- **Easier Maintenance**: Changes to subsystems don't affect client code
- **Improved Readability**: Clear, intention-revealing API for hotel operations

## 📊 UML Class Diagram

![UML Class Diagram](https://github.com/user-attachments/assets/ee21370b-96ff-462c-a4a7-3f6728845353)

The following diagram illustrates:
- The architecture of the Hotel Management Facade
- Relationships between the core components:
  - The `FrontDesk` facade class
  - The `HotelService` interface
  - Concrete implementations: `Valet`, `HouseKeeping`, `Cart`
  - The main application class `HotelApp`
- How the Facade design pattern is applied in this project

## 🚀 Features

- **Unified Service Interface**: Single entry point for all hotel services
- **Service Orchestration**: High-level methods that delegate to appropriate subsystems
- **Extensible Design**: Easy to add new hotel services
- **Clean Architecture**: Well-structured, maintainable code
- **Type-Safe Operations**: Strong typing for all service operations

## 📁 Project Structure

```
hotel-management-facade/
├── src/
│   ├── FrontDesk.java              # Facade providing unified interface
│   ├── HotelService.java           # Service interface contract
│   ├── Valet.java                  # Valet parking service implementation
│   ├── HouseKeeping.java           # Housekeeping service implementation
│   ├── Cart.java                   # Luggage cart service implementation
│   └── HotelApp.java               # Main application demo
└── README.md                       # Project documentation
```

## 🛠️ Installation & Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Getting Started

1. **Clone or download** the project files
2. **Navigate** to the project directory
3. **Compile** the Java files:
   ```bash
   javac src/*.java
   ```
4. **Run** the application:
   ```bash
   java -cp src FacadePattern.HotelApp
   ```

## 📖 Usage

### Basic Usage

The main application (`HotelApp.java`) demonstrates how to use the facade pattern:

```java
// Create the front desk facade
FrontDesk frontDesk = new FrontDesk();

// Request valet service
frontDesk.pickUpVehicle("XYZ-1234");

// Request housekeeping service
frontDesk.cleanRoom(42);

// Request luggage cart service
frontDesk.requestCart(3);
```

### Expected Output

When you run the application, you'll see:

```
Vehicle with Plate Number XYZ-1234 has been successfully picked up!

Room 42 has been tidied up and refreshed!

3 cart/s are on their way!
```

## 🔧 Extending the Project

### Adding New Hotel Services

To add a new hotel service (e.g., `ConciergeService`):

1. **Create** a new class implementing the `HotelService` interface
2. **Add** the service to the `FrontDesk` facade
3. **Implement** the required methods and add facade methods

Example:
```java
public class ConciergeService implements HotelService {
    @Override
    public void provideService() {
        // Implementation details
    }
    
    public void bookRestaurant(String restaurant, String time) {
        System.out.println("Reservation confirmed at " + restaurant + " for " + time);
    }
}
```

Then add to FrontDesk:
```java
private ConciergeService conciergeService;

public void bookRestaurant(String restaurant, String time) {
    conciergeService.bookRestaurant(restaurant, time);
}
```

## 🎯 Design Patterns Used

### Facade Pattern
- **Purpose**: Provide a unified interface to a set of interfaces in a subsystem
- **Benefits**: Simplifies complex interactions and reduces coupling
- **Implementation**: `FrontDesk` acts as the facade, coordinating multiple hotel services

### Interface Segregation
- **Purpose**: Define a common contract for all hotel services
- **Benefits**: Ensures consistency across service implementations
- **Implementation**: `HotelService` interface provides the contract for all services

## 🤝 Contributing

Feel free to contribute to this project by:
- Adding new hotel services
- Improving documentation
- Enhancing the facade pattern implementation
- Adding unit tests

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Note**: This implementation demonstrates clean code principles and design patterns best practices. The Facade pattern is particularly useful when you need to provide a simplified interface to a complex subsystem, making it easier to use while hiding the complexity of the underlying services.

