<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Profile</title>
</head>

<body>
    <form>
        <h2><?= $_SESSION['user']['login'] ?></h2>
        <h2><?= $_SESSION['user']['password'] ?></h2>
        <a href="#"><?= $_SESSION['user']['email'] ?></a>
        <a href="main/logout.php" style="color: rgb(200, 64, 26);text-align: center;">Exit</a>
    </form>
</body>

</html>