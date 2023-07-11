export interface DeveloperOptionsPlugin {
  isDevelopmentSettingsEnabled(): Promise<boolean>;
  openDeveloperOptions(): Promise<void>;
}
