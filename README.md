**Basic Java Swing program structure**

Java Swing is used to give a basic Java program a basic UI.

Basic structure is:

---

### 1. Firstly you need to import some basic packages like

```
import javax.swing.*;
import java.awt.event.*;
```

**Why to import them?**

* The first package gives access to Java components like `JFrame`, `JButton`, etc.
* `java.awt.event.*` is used mainly for event handling like `ActionEvent`, `ActionListener`, etc.

---

### 2. Next comes the class declaration where the creation of our own Swing application begins

```
class HelloSwing extends JFrame implements ActionListener { }
```

The main meaning of this statement is:

* You are creating a class `HelloSwing` that extends `JFrame`, where our class becomes a window
* The class knows how to handle buttons

---

### 3. Now comes the variable declaration, those are also called the components of the `JFrame`

The basic components are:

* `JLabel` – (Display text / output)
* `JTextField` – (Single line input)
* `JTextArea` – (Multi-line input)
* `JButton` – (Trigger an action)
* `JCheckBox` – (Multiple choice selection)
* `JRadioButton` – (Single choice selection)
* `JComboBox` – (Drop-down list)
* `JList` – (List selection)
* `JScrollPane` – (Adds scrolling to `JTextArea`, `JList`, `JTable`, etc.)
* `JTable` – (Tabular data)
* `JMenuBar`, `JMenu`, `JMenuItem` – (Creates menus like File, Edit, Help, etc.)
* `JOptionPane` – (Dialog box)
* `JPanel` – (Container inside a frame)

---

### 4. Now comes the constructor creation (This is also called the UI building area)

**Example:**

```
HelloSwing() { }
```

What we can do in this constructor?

* Create components
* Add them to the frame window
* Register listeners
* Set the frame properties

---

### 5. Now declare the component

**Example:**

```
b = new JButton("Click me");
```

---

### 6. Now add the button to the `JFrame`

**Example:**

```
add(b);
```

---

### 7. Now register the `ActionListener` for the component created

**Example:**

```
b.addActionListener(this);
```

---

### 8. Now, if needed, layout management is done

---

### 9. Frame settings are added at the end of the constructor

---

### Sample code example:

```java
class TextCopy extends JFrame implements ActionListener {

    JTextField t;
    JTextArea ta;
    JButton b;

    TextCopy() {
        t = new JTextField(15);
        ta = new JTextArea(5, 15);
        b = new JButton("Copy");

        add(t);
        add(b);
        add(ta);

        b.addActionListener(this);

        setLayout(new java.awt.FlowLayout());
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

---

### 10. Event handling method

**Example:**

```
public void actionPerformed(ActionEvent e) { }
```

**Why this exists:**

* Required because we implemented `ActionListener`
* This method runs automatically when the button is clicked
* Java calls this method; you don’t call it

---

### 11. Button click action

**Example:**

```
JOptionPane.showMessageDialog(this, "Hello Swing!");
```

**What happens:**

* Shows a pop-up dialog
* `this` → parent window
* Message → "Hello Swing!"
* This is the reaction to the button click

---

### 12. `main()` method

**Example:**

```java
public static void main(String[] args) {
    new HelloSwing();
}
```

**Why needed:**

* Program execution starts here
* Object creation calls the constructor
* Constructor builds the UI
* `main()` → creates window → constructor runs

---

### PERFECT FLOW DIAGRAM

```
main()
 ↓
Object created
 ↓
Constructor runs
 ↓
UI built
 ↓
User clicks button
 ↓
actionPerformed() runs
```
