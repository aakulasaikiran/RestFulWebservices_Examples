package com.nt.lsn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.lsn.domain.Product;
import com.sun.media.jfxmedia.Media;

@Path("ProductService")
public class ProductService {
/*note :Chage
 *
 *  
 *  @Query to @PathAnnotation
	2.change @pathAnnotion Value like /{pid}
	3.change Request  like /302
	
	For JSON OUT PUT open SoupUi tool
	Create REST Project with url
	and Run then it will give the Result
	*/
	
/*
	 1 XML OUT PUT
	 
	 Input 
	http://localhost:8080/Restful_Jersey_QueryParamExamples/ProductService/getProductinXML/301
	 
	 OutPut
	<?xml version="1.0" encoding="UTF-8" standalone="true"?>

-<product>

<pid>301</pid>

<pname>computer</pname>

<price>300.0</price>

</product>

</product>
	*/
	
	
	/*@Path("/getProductinXML/{pid}")
	@Produces(MediaType.APPLICATION_XML)
	
	@GET
	public Product searchProduct1(@PathParam("pid") Integer pid) {
		System.out.println("entered in searchProduct1 Method");
		Product p = null;
		if (pid != null && pid.equals(301)) {
			p = new Product();
			p.setPid(pid);
			p.setPname("computer");
			p.setPrice(300.0);
		}

		return p;

	}

	*/
	
	
	/*
	 2  for JSON
	 
	 
	 Input
	http://localhost:8080/Restful_Jersey_QueryParamExamples/ProductService/getProductinJSON/301 
	  Out Put
	  {
   "pid": 301,
   "pname": "computer",
   "price": 300
}
	  
	*/
	
	
	/*@Path("/getProductinJSON/{pid}")
	@Produces(MediaType.APPLICATION_JSON)
	
	@GET
	public Product searchProduct1(@PathParam("pid") Integer pid) {
		System.out.println("entered in searchProduct1 Method");
		Product p = null;
		if (pid != null && pid.equals(301)) {
			p = new Product();
			p.setPid(pid);
			p.setPname("computer");
			p.setPrice(300.0);
		}

		return p;

	}
*/
	
	
	
	/*
	3 TEXT_PLAIN 
	  
	Give Request 
	Input:
	http://localhost:8080/Restful_Jersey_QueryParamExamples/ProductService/getProductinTEXT_PLAIN/302
	
	Out:
	Product not Found


	
	*/
	
	
	@GET
	@Path("/getProductinTEXT_PLAIN/{pid}")
	@Produces(MediaType.TEXT_PLAIN)
	
	
	public String searchProduct1(@PathParam("pid") Integer pid) {
		System.out.println("entered in searchProduct1 Method");
		Product p = null;
		if (pid != null && pid.equals(301)) {
			return "keyBoard";
		}

		return "Product not Found";

	}

	
	
	
	
	
	
	
	
}
