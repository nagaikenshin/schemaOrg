package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.DOMICILED_MORTGAGE;
import org.kyojo.schemaorg.m3n5.pending.Container.DomiciledMortgage;

@ExternalDomain
public class DomiciledMortgageConverter implements DomainConverter<DomiciledMortgage, Boolean> {

	@Override
	public Boolean fromDomainToValue(DomiciledMortgage domain) {
		return domain.getNativeValue();
	}

	@Override
	public DomiciledMortgage fromValueToDomain(Boolean value) {
		return new DOMICILED_MORTGAGE(value);
	}

}