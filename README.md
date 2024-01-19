# smit_praktika_back

Minimalistic info system for accounts with code names. 

## Prerequisites

**Java**

**Maven**

**PostgreSQL Database**

## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/smit_praktika_back.git
    cd smit_praktika_back
    ```

2. **Configure the Database:**

   Open `src/main/resources/application.properties` and set the database connection properties:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    ```

   Replace `your_database_name`, `your_username`, and `your_password` with your actual PostgreSQL database details.

3. **Build and Run the Application:**

    ```bash
    mvn spring-boot:run
    ```

The application should now be running locally, connected to your PostgreSQL database.

4. **Use the SQL Dump File:**

   If you want to use a pre-populated database with sample data, you can import the included SQL dump file. The file is located in the root of the project and named `database_dump.sql`.

   To restore the database using the dump file, run the following command:

   ```bash
   psql -h localhost -p 5432 -U your_username -d your_database_name < database_dump.sql