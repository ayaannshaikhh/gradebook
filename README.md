# Gradebook Application

This project is a command-line Java application that allows users to create and manage a gradebook for multiple assignments. It calculates the final average grade based on weighted assignments and includes the option for bonus marks.

## Features

- Input assignment names, grades, and weightages.
- Validate total weightage to ensure it equals 100% (including bonus marks if applicable).
- Dynamically calculate the final average based on assignment grades and weights.
- Optionally add bonus marks with a specific weight and grade.
- Display a formatted gradebook table for better visualization.

## How It Works

1. **Input Assignment Details**:
   - Enter the total number of assignments (minimum of 2).
   - Provide assignment names, grades (0-100), and weightages (greater than 0 and up to 100).
2. **Bonus Marks**:
   - Optionally include bonus marks with a specific weight and grade.
3. **Validation**:
   - The program ensures the total weightage (assignments + bonus) equals 100%.
   - If validation fails, the user is prompted to re-enter the data.
4. **Final Average Calculation**:
   - Computes the weighted average of grades and displays the result.
5. **Formatted Output**:
   - Prints a neatly formatted table of assignment details and the final average.

## Example Usage

```
Begin by entering the amount of tasks you wish to input: 2
Enter assignment name #1: Test 1
Enter the grade received for 'Test 1': 90
Enter the weightage of 'Test 1': 50
Enter assignment name #2: Test 2
Enter the grade received for 'Test 2': 85
Enter the weightage of 'Test 2': 50
Are you given bonus marks in your final grade? (yes/no): yes
Please enter the additional weighting of bonus marks: 5
Please enter the corresponding grade you received for the bonus: 100

Assignment:          Grade:     Weight:   
Test 1               90%        50%       
Test 2               85%        50%       
Bonus                100%       5%        
Final Average: 90.75%
```

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/ayaannshaikhh/gradebook.git
   ```

2. Navigate to the project directory:
   ```bash
   cd gradebook
   ```

3. Compile the Java program:
   ```bash
   javac App.java
   ```

4. Run the program:
   ```bash
   java App
   ```

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## Files

- `App.java`: Main program file containing the logic for the gradebook application.

## Features to Add in the Future

- Allow exporting the gradebook table to a file (e.g., CSV or text).
- Add error handling for invalid inputs.
- Implement a GUI version for enhanced usability.

## Contributing

Feel free to fork the repository and submit pull requests for improvements or new features.

## License

This project is open-source and available under the [MIT License](LICENSE).

---

### Author

[Ayaan Shaikh](https://github.com/ayaannshaikhh)
