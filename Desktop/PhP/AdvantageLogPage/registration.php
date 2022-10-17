<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Welcome</title>
</head>

<body>
    <form action="main/signUp.php" method="POST">
        <label>Login</label>
        <input type="text" placeholder="Input login" name="login">
        <label>Email</label>
        <input type="text" placeholder="Input Email" name="email">
        <label>Password</label>
        <input type="password" placeholder="Input pass" name="password">
        <label>Confirm Password</label>
        <input type="password" placeholder="Confirm pass" name="confirmed_password">
        <button type="submit">Register</button>
        <p>Have you already account ? - <a href="log.php">Login here</a></p>
 
        <?php
            if (!empty($_SESSION['message'])) {
                echo '<p class="msg"> ' . $_SESSION['message'] . ' </p>';
            }
            unset($_SESSION['message']);
        ?>
    </form>
</body>

</html>