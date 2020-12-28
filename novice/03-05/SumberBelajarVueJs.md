https://mfaridzia.medium.com/single-page-application-dengan-vue-js-dan-vue-router-7cccb14269d0



langkah belajar vue js
1.  ganti script APP.VUE

<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">            //hapus
    <HelloWorld msg="Welcome to Your Vue.js App"/>          //hapus
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>


++++++++++++++++++++++++++++++++++++++rubah app vue mnjdi++++++++++++

<template>
  <div id="app">
   <div class="detail">
     <router-view></router-view>                //ganti ini
   </div>
  </div>
</template>

<script>
export default {
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Sedikit penjelasan, pada script diatas kita menambahkan code router-view untuk nantinya menampilkan data yang cocok dengan data yang dipilih oleh user, untuk yang lainya sama saja seperti sintaks vue pada umumnya.

2. Buka file index.js yang berada pada folder src/router/index.js

kemudian editlah file index.js menjadi seperti berikut ini :

import Vue from 'vue'
import Router from 'vue-router'
import User from "@/components/User"
import Home from "@/components/Home";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: "/user/:id",
      name: "User",
      component: User
    }
  ]
})


++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Yang perlu diperhatikan pada script diatas adalah pada bagian /user/:id karena ini yang akan kita gunakan nanti sebagai halaman detailnya, dan jangan lupa untuk mengimport terlebih dahulu file Home dan User.vue nya.

3.	Langkah berikutnya adalah kita akan menginstal axios untuk keperluan consume data nantinya, ketikan perintah berikut pada terminal anda :

    npm install axios --save
    
  	
  	pujiono@pujiono:~/Documents/praxis_academy/novice/03-05/belajarvuejs
$ npm install axios --save
npm WARN npm npm does not support Node.js v10.21.0
npm WARN npm You should probably upgrade to a newer version of node as we
npm WARN npm can't make any promises that npm will work with this version.
npm WARN npm Supported releases of Node.js are the latest release of 4, 6, 7, 8, 9.
npm WARN npm You can find the latest version at https://nodejs.org/
npm WARN optional SKIPPING OPTIONAL DEPENDENCY: vue-loader-v16@npm:vue-loader@^16.0.0-beta.7 (node_modules/@vue/cli-service/node_modules/vue-loader-v16):
npm WARN optional SKIPPING OPTIONAL DEPENDENCY: Unsupported URL Type "npm:": npm:vue-loader@^16.0.0-beta.7
npm WARN @vue/cli-service@4.5.9 requires a peer of @vue/compiler-sfc@^3.0.0-beta.14 but none is installed. You must install peer dependencies yourself.
npm WARN optional SKIPPING OPTIONAL DEPENDENCY: fsevents@2.1.3 (node_modules/fsevents):
npm WARN notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@2.1.3: wanted {"os":"darwin","arch":"any"} (current: {"os":"linux","arch":"x64"})
npm WARN optional SKIPPING OPTIONAL DEPENDENCY: fsevents@1.2.13 (node_modules/watchpack-chokidar2/node_modules/fsevents):
npm WARN notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@1.2.13: wanted {"os":"darwin","arch":"any"} (current: {"os":"linux","arch":"x64"})
npm WARN optional SKIPPING OPTIONAL DEPENDENCY: fsevents@1.2.13 (node_modules/webpack-dev-server/node_modules/fsevents):
npm WARN notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@1.2.13: wanted {"os":"darwin","arch":"any"} (current: {"os":"linux","arch":"x64"})

+ axios@0.21.1
added 1 package from 1 contributor in 31.221s
pujiono@pujiono:~/Documents/praxis_academy/novice/03-05/belajarvuejs
$ 
    
4.	 Kemudian setelah selesai langkah selanjutnya adalah buatlah file baru dengan nama Home.vue pada folder src/components/Home.vue, dan ketikan kode berikut ini :

<template>
  <div id="container">
   <header>
     <h1> Daftar Nama User : </h1>
   </header>
   <div class="list">
     <ul v-for="user in users" :key="user.id" style="list-style: none">
         <li>
            <router-link :to="{ name: 'User', params: { id: user.id } }">
                {{ user.name }}
            </router-link>
        </li>
     </ul>
   </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
    return {
      users: []
    }
  },
  created() {
    this.getAllUser()
  },
  methods: {
    getAllUser() {
      axios.get('https://jsonplaceholder.typicode.com/users')
      .then((response) => {
        this.users = response.data
        console.log(response)
      })
      .catch((err) => {
        console.log(err)
      })
    }
  }
}
</script>

<style scoped>
.list {
    margin-left: -50px;
}
</style>




5.	Pertama kita mengimport library axios agar bisa kita gunakan untuk mengkonsumsi data apinya, setelah itu membuat sebuah method bernama getAllUser() yang akan kita gunakan untuk mengambil data dari layanan api yang kita gunakan, setelah itu kita juga menggunakan fungsi created untuk menjalankan kode kita setelah sebuah instance dibuat, kemudian pada bagian template nya kita tampilkan datanya dengan menggunakan v-for dan menggunakan fungsi dari vue-router yaitu router-link untuk navigasi.

Langkah terakhir tapi bukan terakhir adalah silahkan buat sebuah file bernama User.vue di dalam folder /src/components/User.vue

kemudian isikan dengan kode berikut :


<template>
    <div class="container">
        <div class="user">
            <h2> Data user dengan nama : {{ user.name }} </h2>
            <ul>
                <li> Username : {{ user.username }} </li>
                <li> Email : {{ user.email }} </li>
            </ul>
            <router-link to="/"> Back </router-link>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
      return {
          user: []
      }
  },
  created() {
      this.getUser()
  },
  methods: {
      getUser() {
          axios.get(`https://jsonplaceholder.typicode.com/users/${this.$route.params.id}`)
          .then((response) => {
            this.user = response.data
          })
          .catch((err) => {
            console.log(err)     
          })
      }
  }
}
</script>

<style scoped>
ul li {
    list-style: none;
}
</style>

+++++++++++++++++++++++++++++++

6. Kode diatas hampir sama dengan kode pada file home.vue, bedanya adalah dibagian url endpointnya kita menambahkan kode this.$route.params.id yang fungsinya adalah untuk menangkap id parameters yang sebelumnya didapatkan pada halaman Home yang mana juga digunakan untuk menampilkan data detail masing-masing user.

Setelah semuanya selesai langkah terakhir adalah mencoba menjalankan aplikasi, ketikan perintah berikut pada terminal untuk menjalankan aplikasi :

npm run dev

Jika berjalan dengan lancar maka kurang lebih tampilanya akan seperti berikut :
Image for post
Image for post
Halaman Home
Image for post
Image for post
Halaman Detail User

    Catatan: kalo tampilanya jelek maklumin aja hehe karena disini kita fokus pada implementasi SPA nya dengan vue, untuk styling css nya silahkan teman-teman edit sendiri sesuai dengan keinginan 😵

Akhirnya selesai juga artikel kali ini, saya harap teman teman bisa mendapatkan banyak ilmu dari artikel yang sederhana dan masih banyak kekurangan ini, oh iya jika ada pertanyaan atau masih ada yg kurang jelas silahkan langsung meninggalkan pertanyaanya pada kolom komentar dibawah ya.

Jangan lupa tekan tombol claps 👏 nya ya jika anda merasa artikel ini membantu, Sekian dan Terimakasih. ☺

Dokumentasi vue-router

++++++++++++++++++++++++++++++++++++++++++

