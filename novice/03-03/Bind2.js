class Button {
    constructor(value) {
        console.log("masuk constructor");
      this.value = value;
    }
    click = function(){
      console.log("masuk click")  
      console.log(this.value);
    }
  }
  
  let button = new Button("hello");
  
  setTimeout(button.click, 1000); // hello