

    <?php

    /* Attempt MySQL server connection. Assuming you are running MySQL

    server with default setting (user 'root' with no password) */

       include("config.php");
     if($_SERVER["REQUEST_METHOD"] == "POST") {

    // Escape user inputs for security
$empid = mysqli_real_escape_string($link, $_POST['empid']);

    
    $lname = mysqli_real_escape_string($link, $_POST['lname']);
    $fname = mysqli_real_escape_string($link, $_POST['fname']);
$hiredate  = mysqli_real_escape_string($link, $_POST['hiredate']);


    $salary = mysqli_real_escape_string($link, $_POST['salary']);
$deptid = mysqli_real_escape_string($link, $_POST['deptid']);
$deptname = mysqli_real_escape_string($link, $_POST['deptname']);
$location = mysqli_real_escape_string($link, $_POST['location']);
$poid = mysqli_real_escape_string($link, $_POST['poid']);
$podescription = mysqli_real_escape_string($link, $_POST['podescription']);

    
    


    
    
   $sql1 = "INSERT INTO Employee(empid,lname,fname,hiredate,salary) VALUES ('$empid','$lname','$fname','$hiredate','$salary')";
    $ss1= mysqli_query($link, $sql1); 
   //$sql3 = "INSERT INTO posn(empid,podescription,poid) VALUES ('$empid','$podescription','$poid')";
   //$ss3= mysqli_query($link, $sql3);
    
   // $sql2 = "INSERT INTO department(deptid,deptname,location,empid) VALUES ('$deptid','$deptname','$location','$empid')";
   //$ss2= mysqli_query($link, $sql2);
   
    if($ss1==1){

        echo "Records added successfully.";

    } else{

        echo "ERROR: Could not able to execute $sql. " . mysqli_error($link);

    }

     

 }

    ?>


    <html lang="en">

    <head>

    <meta charset="UTF-8">

    <title>Add Record Form</title>

    </head>

    <body>

    <form action="login.php" method="post">

             <p>

            <label for="empid">Empid:</label>

            <input type="text" name="empid" id="empid">

        </p>

        <p>

            <label for="lname">Last Name:</label>

            <input type="text" name="lname" id="lname">

        </p>


        <p>

            <label for="fname">First Name:</label>

            <input type="text" name="fname" id="fname">

        </p>

        

        <p>

            <label for="hiredate">Hire Date:</label>

            <input type="text" name="hiredate" id="hiredate">

        </p>

        <p>
        



            <label for="salary">Salary:</label>

            <input type="text" name="salary" id="salary">

        </p>
         <p>

            <label for="deptid">Dept Id:</label>

            <input type="text" name="deptid" id="deptid">

        </p>
        <p>

            <label for="deptname">Dept Name:</label>

            <input type="text" name="deptname" id="deptname">

        </p>
        <p>

            <label for="location">Location:</label>

            <input type="text" name="location" id="location">

        </p>

        <p>

       
            <label for="poid">Position ID:</label>

            <input type="text" name="poid" id="poid">

        </p>

             <p>

            <label for="podescription">podescription</label>

            <input type="text" name="podescription" id="podescription">

        </p>
        


       

    
                <input type="submit" value="Submit">

    </form>

    </body>

    </html>




    


