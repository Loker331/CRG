<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "projekt";


$conn = new mysqli($servername, $username, $password);

    if ($conn->connect_error){
        die("connection failed: " . $conn->connect_error);
    }
echo "Connected succesfully </br>";

$sql - "SELECT id, username, password FROM Users";
$result = $conn->query($sql);

if($result->num_rows > 0){
    while($row = $result->fetch_assoc()){
        echo "id: " . $row["id"] . "</br>";
        echo "username: " . $row["username"] . "</br>";
        echo "password: " . $row["password"] . "</br>";
    }
}
else{
    echo "0 results.";
}


    
?>