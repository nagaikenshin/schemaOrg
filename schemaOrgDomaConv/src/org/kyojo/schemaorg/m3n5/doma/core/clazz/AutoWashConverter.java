package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AUTO_WASH;
import org.kyojo.schemaorg.m3n5.core.Clazz.AutoWash;

@ExternalDomain
public class AutoWashConverter implements DomainConverter<AutoWash, String> {

	@Override
	public String fromDomainToValue(AutoWash domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoWash fromValueToDomain(String value) {
		return new AUTO_WASH(value);
	}

}
