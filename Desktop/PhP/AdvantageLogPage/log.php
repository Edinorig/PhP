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
    <form action="main/signIn.php" method="POST">
        <label>Login</label>
        <input type="text" placeholder="Input login" name="login">
        <label>Password</label>
        <input type="password" placeholder="Input pass" name="password">
        <button type="submit">Submit</button>
        <p>Don't have account ?- <a href="registration.php">Register here</a></p>

        <?php
            if (!empty($_SESSION['message'])) {
                echo '<p class="msg"> ' . $_SESSION['message'] . ' </p>';
            }
            unset($_SESSION['message']);
        ?>
    </form>
</body>
</html>