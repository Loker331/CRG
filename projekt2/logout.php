<?php
    include 'connection.php';
    if (!valid_credentials) {
    header('Location: login.php');
    exit();
    }

$_SESSION['user'] = 'username';


if (!isset($_SESSION['user'])) {
    header('Location: login.php');
    exit();
}
   

?>
<h1>Create a User</h1>
<form action="create.php" method="post">
    Name<input type ="text" name="inputName" value="" /><br />
    Description<input type ="text" name="inputDesc" value="" />
    <br />
    <input type="submit" name="submit" />
</form>