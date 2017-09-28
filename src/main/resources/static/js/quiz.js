$(document).ready(function(){
    var ms = 1000;
    do{

        $('#myid').setTimeout(function(){
            $.get('rest-template/message/', function(data){
                $('#myid').html(data);
            })

        }, ms);

    }while(true)
});