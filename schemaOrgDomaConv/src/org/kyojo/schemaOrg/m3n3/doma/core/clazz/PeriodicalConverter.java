package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERIODICAL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Periodical;

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
