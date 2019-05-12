package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CALORIES;
import org.kyojo.schemaorg.m3n5.core.Container.Calories;

@ExternalDomain
public class CaloriesConverter implements DomainConverter<Calories, String> {

	@Override
	public String fromDomainToValue(Calories domain) {
		return domain.getNativeValue();
	}

	@Override
	public Calories fromValueToDomain(String value) {
		return new CALORIES(value);
	}

}
