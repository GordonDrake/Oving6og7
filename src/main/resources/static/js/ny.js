$(document).ready(function(){
    $("#send").click(function(e){
        e.preventDefault();
        $.post("/question", $("#form").serialize(), function(data, status){
            //alert("Data: " + data + "\nStatus: " + status);
            $("#quizId").val(data);
            $("#q1_text").val('');
            $("#q1_a1").val('');
            $("#q1_a2").val('');
            $("#q1_a3").val('');
            $("#q1_a4").val('');
            $("#q1_ca").val('');
            alert(status);
        });

    });
    /*
    $('#form').on('submit', function(){
        return false;
    });
    */
    $('#send_name').click(function(e) {
        e.preventDefault();
        var $quizName = $('#name').val();

        $.ajax({
          url: "http://localhost:8080/ny",
          type: "POST",
          data:$quizName,
          contentType:"text/plain; charset=utf-8",
          success: function(data){
            window.location = 'http://localhost:8080/question?quizname=' + $quizName + "&quizid=" + data.id;
          }
        })
        return false;
        /*
        $("#name").hide();
        $("#send_name").hide();

        $("#q1_text").show();
        $("#q1_a1").show();
        $("#q1_a2").show();
        $("#q1_a3").show();
        $("#q1_a4").show();
        $("#q1_ca").show();

        $("quiz_name").show();
        $(".question").show();
        */
    });

});