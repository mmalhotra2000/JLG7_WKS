package com.assinment.iris;

public class MyTopicSubscriber implements Observer {

	private Price price;
	private Instrument instrument;
	private Subject topic;

	public MyTopicSubscriber(Price price) {
		super();
		this.price = price;
	}

	public MyTopicSubscriber(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public void update() {
		Object obj = topic.getUpdate(this);
		Price price = null;
		if (obj instanceof Price) {
			price = (Price) topic.getUpdate(this);
		}

		Instrument instrument = null;
		if (obj instanceof Instrument) {
			instrument = (Instrument) topic.getUpdate(this);
		}

		if (price == null) {
			System.out.println(price + ":: No new price");
		} else {
			System.out.println(price + ":: Consuming message::" + price);
		}

	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

}
