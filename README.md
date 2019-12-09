# SpringWeb

_En este repositorio se toman algunos temas actuales de spring los cuales se dividiran por proyectos
y se explicara como utilizarlos_

## Pre-requisitos 🚀

_Herramientas necesarias_

```
JDK8+
Maven
Spring Tools
```
## Proyectos 🚀

* SpringWeb 📋
```
Proyecto en el cual se dan algunos ejemplos de como manejar los controladores y diferentes formas
de redireccionar una pagina con parametros
```
* Anotaciones Fundamentales
```
@Controller
@RequestMapping
@GetMapping - @RequestMapping(value = {"index"} , method=RequestMethod.GET)
@PostMapping - @RequestMapping(value = {"index"} , method=RequestMethod.POST)
@PutMapping - @RequestMapping(value = {"index"} , method=RequestMethod.PUT)
@DeleteMapping - @RequestMapping(value = {"index"} , method=RequestMethod.DELETE)
```
* SpringBootInjectionGit 📋
```
Proyecto en el cual se dan algunos ejemplos de como manejar los controladores y realizar algunas inyeciones
con archivos de propiedades y la anotacion @Bean
```
```
@Component //Declara la clase como parte de spring boot
@RequestScope //Realiza peticiones HTTP
@Configuration //configurar una aplicación Spring basada en las dependencias que están presentes en el classpath
@Bean //Un bean es un objeto que se crea una instancia
```
