import { WebPlugin } from '@capacitor/core';

import type { DeveloperOptionsPlugin } from './definitions';

export class DeveloperOptionsWeb extends WebPlugin implements DeveloperOptionsPlugin {
  isDevelopmentSettingsEnabled(): Promise<{ value: boolean; }> {
    throw new Error('Method not implemented.');
  }
  openDeveloperOptions(): Promise<void> {
    throw new Error('Method not implemented.');
  }
}
