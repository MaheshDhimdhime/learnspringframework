//package codingpractice;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Product {
//	int id;
//	String name;
//	float price;
//
//	public Product(int id, String name, float price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//
////	@Override
////	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + ((name == null) ? 0 : name.hashCode());
////		result = prime * result + Float.floatToIntBits(price);
////		return result;
////	}
////
////	@Override
////	public boolean equals(java.lang.Object obj) {
////		if (this == obj)
////			return true;
////		if (obj == null)
////			return false;
////		if (getClass() != obj.getClass())
////			return false;
////		Product other = (Product) obj;
////		if (name == null) {
////			if (other.name != null)
////				return false;
////		} else if (!name.equals(other.name))
////			return false;
////		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
////			return false;
////		return true;
////	}
//}
//
//public class StreamCollection {
//
//	public static void main(String[] args) {
//		List<Product> list = new ArrayList<>();
//		list.add(new Product(1, "Mahesh", 1000));
//		list.add(new Product(2, "Mahesh2", 2000));
//		list.add(new Product(3, "Mahesh3", 3000));
//		list.add(new Product(4, "Mahesh3", 3000));
//
////		HashSet<Product> UniqueProductSet = new HashSet<Product>();
////		for (Product productSet : list) {
////			UniqueProductSet.add(productSet);
////		}
////		Stream<Product> filterData = list.stream().distinct().filter(p -> p.price > 2000);
////		filterData.forEach(product -> {
////			System.out.println(product.name + " : " + product.price);
////		});
//	//	List<Float> productPriceList2 = list.stream().filter(p -> p.price > 30000).map(p -> price)
//				.collect(Collectors.toList());
//		System.out.println(productPriceList2);
//	}
//}
