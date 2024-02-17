

function login(name) {
  $(function () {
    const floatingInput = document.getElementById("floatingInput").value;

    const Password = document.getElementById("Password").value;




    const regex = /^[0-9a-zA-Z]+$/;
    var Blank = '';
    if (floatingInput == Blank) {
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー UserIDが空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');

    

  }






    if (Password == Blank) {
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    } else if (Password.length < 8) {
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが8文字以下です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    } else if (Password.length > 20) {
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが20文字以上です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    } else if (regex.test(Password)) {
    } else {
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 半角英字、半角数字以外が含まれています<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');

    }





  });
}


