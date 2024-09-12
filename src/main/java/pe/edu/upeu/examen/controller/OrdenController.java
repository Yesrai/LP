package pe.edu.upeu.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import pe.edu.upeu.examen.entity.Orden;
import pe.edu.upeu.examen.service.OrdenService;

	@RestController
	@RequestMapping("/api/ordenes")
	public class OrdenController {
		@Autowired
		private OrdenService ordenService;
		
		@GetMapping
		public ResponseEntity<List<Orden>> readAll(){
			try {
				List<Orden> Ordenes = ordenService.readAll();
				if(Ordenes.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(Ordenes, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PostMapping
		public ResponseEntity<Orden> crear(@Valid @RequestBody Orden cat){
			try {
				Orden c = ordenService.create(cat);
				return new ResponseEntity<>(c, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@GetMapping("/{id}")
		public ResponseEntity<Orden> getAutorId(@PathVariable("id") Long id){
			try {
				Orden c = ordenService.read(id).get();
				return new ResponseEntity<>(c, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@DeleteMapping("/{id}")
		public ResponseEntity<Orden> delAutor(@PathVariable("id") Long id){
			try {
				ordenService.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PutMapping("/{id}")
		public ResponseEntity<?> updateAutor(@PathVariable("id") Long id, @Valid @RequestBody Orden cat){

				Optional<Orden> c = ordenService.read(id);
				if(c.isEmpty()) {
					return new ResponseEntity<>(ordenService.update(cat), HttpStatus.OK);
				}else {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}		
			
		}
	}
