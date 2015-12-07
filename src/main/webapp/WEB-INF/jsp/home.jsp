<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="pages/css/style.css"/>
    <meta name="viewport" content="width=device-width,
									initial-scale=1.0,
									maximum-scale=1.0,
									user-scalable=no">
</head>

<body>

<div class="container ">
    <div class="row">
        <div class="col-lg-12 col-md-12">
            <div class="header">
                <a href="/wellcome" class="btn btn-primary btn-sm">
                    Registration
                </a>

            </div>
        </div>
    </div>
    <div class="row">
        <nav class="col-lg-2 col-md-2">
            <ul class="nav nav-pills nav-stacked nav-border">
                <li><a href="#">My page</a></li>
                <li><a href="#">Universe</a></li>
                <li><a href="#">Friends</a></li>
                <li><a href="#">Messages</a></li>
            </ul>

            <ul class="nav nav-pills nav-stacked nav-border">
                <li>
                    <button type="button" class="btn btn-primary btn-sm" data-toggle="modal"
                            data-target="#registration">
                        Registration
                    </button>
                </li>
                <li></li>
            </ul>
        </nav>

        <section class="col-lg-10 col-md-10 content-border">
            asdasdasd
        </section>
    </div>

</div>

<!-- Modal -->
<div class="modal fade" id="registration" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Registration</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" role="form">
                    <div class='form-group'>
                        <label for='firstname' class='col-sm-2 control-label'>First Name</label>

                        <div class='col-sm-10'>
                            <input type='text' class='form-control' id='firstname' placeholder='Enter First Name'>
                        </div>
                    </div>
                    <div class='form-group'>
                        <label for='lastname' class='col-sm-2 control-label'>Last Name</label>

                        <div class='col-sm-10'>
                            <input type='text' class='form-control' id='lastname' placeholder='Enter Last Name'>
                        </div>
                    </div>
                    <div class='form-group'>
                        <div class='col-sm-offset-2 col-sm-10'>
                            <div class='checkbox'>
                                <label>
                                    <input type='checkbox'> Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class='form-group'>
                        <div class='col-sm-offset-2 col-sm-10'>
                            <button type='submit' class='btn btn-default'>Sign in</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
