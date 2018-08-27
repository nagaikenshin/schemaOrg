package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERIODICAL;
import org.kyojo.schemaorg.m3n4.core.Clazz.Periodical;

@ExternalDomain
public class PeriodicalConverter implements DomainConverter<Periodical, String> {

	@Override
	public String fromDomainToValue(Periodical domain) {
		return domain.getNativeValue();
	}

	@Override
	public Periodical fromValueToDomain(String value) {
		return new PERIODICAL(value);
	}

}
