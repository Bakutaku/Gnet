
function signup(name){
  $(function(){
    const floatingInput = document.getElementById("floatingInput").value;
    const birthday = document.getElementById("birthday").value;
    const email = document.getElementById("email").value;
    const Password = document.getElementById("Password").value;
    const RePassword = document.getElementById("RePassword").value;
    
    
    

    const regex = /^[0-9a-zA-Z]+$/; 
    var Blank = '';
    if(floatingInput == Blank){
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 名前が空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
     
      
     

  }

    if(birthday == Blank){
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 誕生日が空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }

    
    if(email == Blank){
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー メールアドレスが空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }

    if(Password == Blank){
        $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }else if(Password.length < 8 ){
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが8文字以下です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }else if(Password.length >20 ){
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー パスワードが20文字以上です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }else if(regex.test(Password)){  
      
    }else{
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 半角英字、半角数字以外が含まれています<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');

    }


    

    if(RePassword == Blank){  
        $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 確認パスワードが空欄です<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }else if(Password !== RePassword){ 
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 確認パスワードがパスワードと違います<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }


    if(document.getElementById("checkbox").checked){
  
    }else{
      $('#al').append('<div class="alert alert-warning alert-dismissible fade show" role="alert">エラー 利用規約に同意していません<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button> </div>');
    }



 });
}

