
function selectGame(id,name){
  $(".game-list").removeClass("active");

  $("#game").attr("value",id);

  $('#'+name).addClass("active");
}

function selectTag(id){
  $(".tag-list").removeClass("active");

  $("#tag").attr("value",id);

  $('#'+id).addClass("active");
}