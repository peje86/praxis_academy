//  https://medium.com/backend-habit/membuat-rest-api-sederhana-dengan-spring-boot-part-iii-user-controller-9adb190ecae1



// <!-- Dalam artikel terakhir ini, kita akan selsaikan projek
//  membuat CRUD Rest API dengan Spring Boot. 
//  Langsung saja, buat sebuah
//   class UserController dengan endpoint “api/users” -->

@RestController
@RequestMapping("/api/users")
public class UserController {     @Autowired
     private final BookServiceImpl userService;}

// @RestController = Adalah Annotasi yang disediakan Spring Boot untuk membuat Response berupa REST API

// @RequestMapping = Adalah endpoint yang nantinya akan kita hit menggunakan Postman

// @Autowired = Pasti kalian sudah tau lah yaa, ini buat nge inject.

// mendapatkan semua data users
getAllUsers()

// method ini akan mengeluarkan semua data users

@GetMapping
public List<User> getAllUsers() {
    return userService.findAllUsers();
}
 

// mendapatkan semua data users by Id user
getUserById()

//method ini akan mengeluarkan satu data user berdasarkan Id

@GetMapping("/{id}")
public ResponseEntity<User> getUserById(@PathVariable Long id) {
    return userService.findUserById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}

// mempunyai satu parameter id dengan annotasi @PathVarible yang nanti nya akan di pass ke userService.


// menambah/ post user baru
createUser()

// sesuai dengan nama nya, method ini kita gunakan untuk menyimpan data user Baru

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public User createUser(@RequestBody @Validated User user) {
    return userService.createUser(user);
}

// menggunakan method POST karena kita akan memberi data ke server.


// merubah data user
updateUser()

// updateUser melakukan proses update user yang sudah disimpan di database menggunakan method PUT

@PutMapping("/{id}")
public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
    return userService.findUserById(id)
            .map(userObj -> {
                userObj.setId(id);
                return ResponseEntity.ok(userService.updateUser(userObj));
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
}


// delete user 
// dan yang terakhir adalah delete

@DeleteMapping("/{id}")
public ResponseEntity<User> deleteUser(@PathVariable Long id) {
    return userService.findUserById(id)
            .map(user -> {
                userService.deleteUserById(id);
                return ResponseEntity.ok(user);
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
}

// untuk source full nya sebagai berikut

  //   Untuk code lengkap nya, teman-teman bisa clone dari repo saya di https://github.com/teten777/spring-boot-rest-api

// // Kesimpulan

// Membuat REST API dengan Spring boot sangatlah mudah karena semua nya sudah disediakan tinggal kita menggunakannya. Untuk itu tetaplah semangat untuk belajar programming dan bila ada yang mau di tanyakan silahkan hubungi saya di email teten.nugraha18@gmail.com

// dan Jika kalian ingin melakukan pengujian Unit Test nya, ini saya sudah membuat artikel nya