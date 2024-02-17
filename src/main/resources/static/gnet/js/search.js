

function selectGame(id,name){
  if(!$("#"+name).hasClass("active")){
    $("#selectGameList").append(
      '<div class="col-2 m-1">'+
        '<button type="button" class="btn btn-info" >'+
          name +
        '</button>' +
        '<input type="hidden" name="game[]" value='+id+'>'+
      '</div>'
    );
    $('#'+name).addClass("active");
  }
}