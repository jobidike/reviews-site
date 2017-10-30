package com.reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review review1 = new Review(1001L, "Macarons", "/images/macarons.jpg", "Dessert/Food",
				"This was my first taste of macarons.They looked stunning, like little jewels in their box. I tried several flavors, but found them overly sweet and without much flavor to distinguish them. Except for the coffee flavor which was quite distinct. My friend, however, thought they were great.",
				"4/1/2017");
		Review review2 = new Review(2002L, "Blackberry Sorbet", "/images/blackberry_sorbet.jpg", "Dessert/Food",
				"Light, fresh and delicious. It was soooo good. The color was gorgeous and everyone at our table loved it! I need to get my hands on this recipe, whoever made this deserves an award.",
				"5/1/2017");
		Review review3 = new Review(3003L, "Apricot Cheesecake Bars", "/images/apricot_cheesecake_bars.jpg",
				"Dessert/Food",
				"My fiancé and I just love cheesecakes and definitely can’t get sick of them! But apricots and cheesecake didn't really hit the spot for us. In my opinion I think it would have been better with some type of berry. It wasn't horrible but I probably wouldn't eat it again!",
				"6/1/2017");
		Review review4 = new Review(4004L, "Red Velvet Cake", "/images/red_velvet_cake.jpg", "Dessert/Food",
				"Oh wow, this is ama-z-z-zing, you know the way to my heart. Hands down, red velvet is my FAVORITE. If a cupcake place has it, I won’t look or consider another flavor choice. I already know what my wedding cake is going to be (can you guess?) ",
				"8/1/2017");

		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
